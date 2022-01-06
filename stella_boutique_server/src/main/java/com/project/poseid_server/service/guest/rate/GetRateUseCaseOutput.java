package com.project.poseid_server.service.guest.rate;

import java.util.List;

import com.project.poseid_server.model.rate.Rate;

public class GetRateUseCaseOutput {
    private List<Rate> rateList;

    public void setRateList(List<Rate> rateList) {
        this.rateList = rateList;
    }

    public List<Rate> getRateList() {
        return rateList;
    }
}