import yfinance as yf

ticker = yf.Ticker("MSFT")
print(ticker)
h = ticker.history(period="1d")
