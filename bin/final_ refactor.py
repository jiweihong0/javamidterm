
# coding:utf-8
from ast import Try
import requests
import pandas as pd
import urllib.parse
import requests
import heapq
import re

module = ["永續運輸",
"氣候變遷"]


def get_url(text1):

    # geturl.py
    headers = {'User-Agent':'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36',"charset":'utf-8',"Content-Type":'text/html'}
    url = f'https://www.google.com/search?q={text1}'
    response = requests.get(url=url,headers=headers)
    response.connection.close()

    # read response
    results = re.findall(r'sa=t&amp;source=web&amp;rct=j&amp;url=(.*?)&amp;', response.text)
    
    decodeurl = [urllib.parse.unquote(i) for i in results]
    
    arr = ['https://support.google.com/websearch/', 'https://policies.google.com/', 'https://policies.google.com/privacy', 'https://support.google.com/websearch/answer/']

    #如果decodeurl有符合arr的就不要
    filtered_arr = [i for i in decodeurl if not any(j in i for j in arr)]
    
    # useheap
    # topurl = heap_url(text1,filtered_arr)
    # usehash
    topurl = hash_url(text1,filtered_arr)
    print(topurl)
    return topurl
# s用名稱算排名

# usehash
def hash_url(url,filtered_arr):
    scores = {}
    for url in filtered_arr:
        score = calculate_score(url)
        scores[url] = score
        
    # 排序網址
    sorted_urls = sorted(scores.items(), key=lambda x: x[1], reverse=True)
    return [url for url, _ in sorted_urls]

#  useheap
def heap_url(url,filtered_arr):
    scores = []
    for url in filtered_arr:
        score = calculate_score(url)
        heapq.heappush(scores, (-score, url))
        
    # 優先佇列中最高分數的網址會排在最前面
    return [url for _, url in heapq.nlargest(len(scores), scores)]

def calculate_score(url):
    keyword = "永續運輸"
    score = url.count(keyword)
    return score
    

# to csv
for i in module:
    topwordurl_arr = get_url(i)
    df = pd.DataFrame(topwordurl_arr, columns=['url'])
    df.to_csv(f'{i}.csv', encoding='utf-8', index=False)

