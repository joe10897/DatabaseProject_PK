package com.project.poseid_server.service.guest.rate;

import com.project.poseid_server.adapter.database.MysqlDriver;
import com.project.poseid_server.model.rate.Rate;
import com.project.poseid_server.service.exception.GetRateErrorException;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class GetRateUseCase {
    @Autowired
    private MysqlDriver mysqlDriver;

    public GetRateUseCase(MysqlDriver mysqlDriver){
        this.mysqlDriver = mysqlDriver;
    }

    public void execute(GetRateUseCaseInput input, GetRateUseCaseOutput output) throws GetRateErrorException {
        //code
    }
}