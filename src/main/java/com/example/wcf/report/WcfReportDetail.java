package com.example.wcf.report;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "cell_phone_summary_v")
public class WcfReportDetail implements WcfReportLine {

    @Id
    private Integer id;

    private Integer employeeId;
    private String employeeName;
    private String model;
    private LocalDate purchaseDate;
    private Integer minutesUsage;
    private Integer dataUsage;

    @Override
    public List<String> reportHeader() {
        return new ArrayList<String>() {{
            add("Employee Id");
            add("Employee Name");
            add("Model");
            add("Purchase Date");
            add("Minutes Usage");
            add("Data Usage");
        }};
    }

    @Override
    public List<String> reportLine() {
        return new ArrayList<String>() {{
            add(employeeId.toString());
            add(employeeName);
            add(model);
            add(purchaseDate.toString());
            add(minutesUsage.toString());
            add(dataUsage.toString());
        }};
    }
}
