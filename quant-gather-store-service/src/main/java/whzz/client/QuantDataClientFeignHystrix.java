package whzz.client;

import cn.hutool.core.date.DateUtil;
import whzz.pojo.*;

import java.util.List;

public class QuantDataClientFeignHystrix implements QuantDataClient{
    @Override
    public String saveStock(Stock stock) {
        return null;
    }

    @Override
    public String saveStocks(List<Stock> stocks) {
        return "stocks save failed: " + DateUtil.now();
    }

    @Override
    public Stock getStock(String code) {
        return null;
    }

    @Override
    public boolean stockExists(String code) {
        return false;
    }

    @Override
    public List<Stock> getAllStocks() {
        return null;
    }

    @Override
    public List<Stock> getListStocks() {
        return null;
    }

    @Override
    public String saveCals(List<TradeCal> cals) {
        return "calendars save failed: " + DateUtil.now();
    }

    @Override
    public String getCalMaxDate() {
        return "2019-01-01";
    }

    @Override
    public List<TradeCal> getOpenCals (String date)
    {
        return null;
    }

    @Override
    public boolean isOpen(String date) {
        return false;
    }

    @Override
    public String saveDailies (List<Daily> dailies)
    {
        return "dailies save failed: " + DateUtil.now();
    }

    @Override
    public String saveXqDailies (List<XqDaily> dailies)
    {
        return "xue qiu dailies save failed: " + DateUtil.now();
    }

    @Override
    public String saveEmDailies(List<EmDaily> dailies) {
        return null;
    }

    @Override
    public String updateDailyLimits (List<DailyLimit> dailies)
    {
        return "daily limits save failed: " + DateUtil.now();
    }

    @Override
    public String saveLimits (List<UpLimit> limits)
    {
        return "up limits save failed: " + DateUtil.now();
    }

    @Override
    public String saveDividens (List<Dividend> dividends)
    {
        return "dividends save failed: " + DateUtil.now();
    }

    @Override
    public String saveTick(Tick tick) {
        return null;
    }
}
