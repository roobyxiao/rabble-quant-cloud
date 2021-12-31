package whzz.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.sql.Date;

@Data
public class Daily {
    private String code;
    private Date date;
    private float open;
    private float high;
    private float low;
    private float close;
    @JSONField(name = "preclose")
    private float lastClose;
    private long volume;
    private float amount;
    private float turn;
    @JSONField(name = "tradestatus")
    private boolean tradeStatus;
    @JSONField(name = "pctChg")
    private float percent;
}
