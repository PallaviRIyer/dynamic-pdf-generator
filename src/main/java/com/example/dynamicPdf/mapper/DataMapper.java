package com.example.dynamicPdf.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import com.example.dynamicPdf.model.Invoice;

@Service
public class DataMapper {

    public Context setData(List<Invoice> invoiceList) {

        Context context = new Context();

        Map<String, Object> data = new HashMap<>();

        data.put("invoices", invoiceList);

        context.setVariables(data);

        return context;
    }
}
