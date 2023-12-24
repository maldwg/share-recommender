from fastapi import FastAPI, Response, Query
from typing import Annotated

import yfinance as yf

app = FastAPI()


@app.get("/api/finance/stocks/{identifier}")
async def get_stock_period(identifier :str, period :str):
    ticker = yf.Ticker(identifier)
    history =  ticker.history(period=period)
    print("test")
    return Response(history.to_json(orient="records"), media_type="application/json")

@app.get("/api/finance/stocks")
async def get_stocks_period(identifier :Annotated[list[str], Query()], period :str):
    identifier_dict = {"identifier": identifier}
    ticker = yf.Tickers(" ".join(identifier_dict["identifier"]))
    histories = { i: ticker.tickers[i].history(period=period).to_json(orient="records") for i in identifier_dict["identifier"]}
    return histories
