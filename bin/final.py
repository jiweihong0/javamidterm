
# coding:utf-8
from ast import Try
import requests
import pandas as pd
import urllib.parse
import requests
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
    print(filtered_arr)

    return filtered_arr
# to csv

for i in module:
    topwordurl_arr = get_url(i)
    df = pd.DataFrame(topwordurl_arr, columns=['url'])
    df.to_csv(f'{i}.csv', encoding='utf-8', index=False)

