import openai
openai.api_key = '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'

response = openai.Completion.create(
    engine="text-davinci-003",
    prompt="DFS是什麼",
    max_tokens=128,
    temperature=0.5,
)

completed_text = response["choices"][0]["text"]
print(completed_text)