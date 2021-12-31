package whzz.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import whzz.pojo.*;

import java.util.List;

@FeignClient(value = "QUANT-DATA-SERVICE", fallback = QuantDataClientFeignHystrix.class)
public interface QuantDataClient {
    @RequestMapping(value = "/stock/save", method = RequestMethod.POST)
    public String saveStock(@RequestBody Stock stock);

    @RequestMapping(value = "/stock/saveAll", method = RequestMethod.POST)
    public String saveStocks(@RequestBody List<Stock> stocks);

    @GetMapping("/stock/get/{code}")
    public Stock getStock(@PathVariable("code") String code);

    @GetMapping("/stock/exists/{code}")
    public boolean stockExists(@PathVariable("code") String code);

    @GetMapping("/stock/getAll")
    public List<Stock> getAllStocks();

    @GetMapping("/stock/getListStocks")
    public List<Stock> getListStocks();

    @RequestMapping(value = "/cal/saveAll", method = RequestMethod.POST)
    public String saveCals(@RequestBody List<TradeCal> cals);

    @RequestMapping(value = "/cal/getMax", method = RequestMethod.GET)
    public String getCalMaxDate();

    @RequestMapping(value = "/cal/getOpenCals/{date}", method = RequestMethod.GET)
    public @ResponseBody List<TradeCal> getOpenCals(@PathVariable("date") String date);

    @RequestMapping(value = "/cal/isOpen/{date}", method = RequestMethod.GET)
    public boolean isOpen(@PathVariable("date") String date);

    @RequestMapping(value = "/daily/saveAll", method = RequestMethod.POST)
    public String saveDailies(@RequestBody List<Daily> dailies);

    @RequestMapping(value = "/daily/saveAll", method = RequestMethod.POST)
    public String saveXqDailies(@RequestBody List<XqDaily> dailies);

    @RequestMapping(value = "/daily/saveAll", method = RequestMethod.POST)
    public String saveEmDailies(@RequestBody List<EmDaily> dailies);

    @RequestMapping(value = "/daily/updateDailyLimits", method = RequestMethod.POST)
    public String updateDailyLimits(@RequestBody List<DailyLimit> dailies);

    @RequestMapping(value = "/limit/saveAll", method = RequestMethod.POST)
    public String saveLimits(@RequestBody List<UpLimit> limits);

    @RequestMapping(value = "/dividend/saveAll", method = RequestMethod.POST)
    public String saveDividens(@RequestBody List<Dividend> dividends);

    @RequestMapping(value = "/tick/save", method = RequestMethod.POST)
    public String saveTick(@RequestBody Tick tick);
}
