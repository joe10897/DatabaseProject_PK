package com.project.poseid_server.adapter.rest; //是否需要adapter?

import com.project.poseid_server.service.user.like.add.AddLikeUseCase;
import com.project.poseid_server.service.user.like.add.AddLikeUseCaseInput;
import com.project.poseid_server.service.user.like.add.AddLikeUseCaseOutput;
import com.project.poseid_server.service.user.like.get.GetLikeUseCase;
import com.project.poseid_server.service.user.like.get.GetLikeUseCaseInput;
import com.project.poseid_server.service.user.like.get.GetLikeUseCaseOutput;
import com.project.poseid_server.service.user.like.remove.RemoveLikeUseCase;
import com.project.poseid_server.service.user.like.remove.RemoveLikeUseCaseInput;
import com.project.poseid_server.service.user.like.remove.RemoveLikeUseCaseOutput;
import com.project.poseid_server.service.user.order.add.AddOrderUseCase;
import com.project.poseid_server.service.user.order.add.AddOrderUseCaseInput;
import com.project.poseid_server.service.user.order.add.AddOrderUseCaseOutput;
import com.project.poseid_server.service.user.order.history.HistoryOrderUseCase;
import com.project.poseid_server.service.user.order.history.HistoryOrderUseCaseInput;
import com.project.poseid_server.service.user.order.history.HistoryOrderUseCaseOutput;
import com.project.poseid_server.service.user.order.item.add.AddIntoOrderUseCase;
import com.project.poseid_server.service.user.order.item.add.AddIntoOrderUseCaseInput;
import com.project.poseid_server.service.user.order.item.add.AddIntoOrderUseCaseOutput;
import com.project.poseid_server.service.user.order.item.remove.RemoveFromOrderUseCase;
import com.project.poseid_server.service.user.order.item.remove.RemoveFromOrderUseCaseInput;
import com.project.poseid_server.service.user.order.item.remove.RemoveFromOrderUseCaseOutput;
import com.project.poseid_server.service.user.order.item.update.UpdateOrderUseCase;
import com.project.poseid_server.service.user.order.item.update.UpdateOrderUseCaseInput;
import com.project.poseid_server.service.user.order.item.update.UpdateOrderUseCaseOutput;

import com.project.poseid_server.service.exception.AddLikeErrorException;
import com.project.poseid_server.service.exception.GetLikeErrorException;
import com.project.poseid_server.service.exception.RemoveLikeErrorException;
import com.project.poseid_server.service.exception.AddOrderErrorException;
import com.project.poseid_server.service.exception.HistoryOrderErrorException;
import com.project.poseid_server.service.exception.AddIntoOrderErrorException;
import com.project.poseid_server.service.exception.RemoveFromOrderErrorException;
import com.project.poseid_server.service.exception.UpdateOrderErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
@RestController
@RequestMapping("/api/user")
public class UserRestAdapter {
    @Autowired
    AddLikeUseCase addLikeUseCase;

    @Autowired
    GetLikeUseCase getLikeUseCase;

    @Autowired
    RemoveLikeUseCase removeLikeUseCase;

    @Autowired
    AddOrderUseCase addOrderUseCase;

    @Autowired
    HistoryOrderUseCase historyOrderUseCase;

    @Autowired
    AddIntoOrderUseCase addIntoOrderUseCase;

    @Autowired
    RemoveFromOrderUseCase removeFromOrderUseCase;

    @Autowired
    UpdateOrderUseCase updateOrderUseCase;

    //--------------------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------- User Like --------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------

    @PostMapping(value = "/add/like")
    public ResponseEntity<AddLikeUseCaseOutput> AddLike(@RequestBody AddLikeUseCaseInput requestBody) {
        AddLikeUseCaseInput input = new AddLikeUseCaseInput();
        AddLikeUseCaseOutput output = new AddLikeUseCaseOutput();
        //----
        input.setUserID(requestBody.getUserID());
        input.setItemID(requestBody.getItemID());
        try {
            this.addLikeUseCase.execute(input,output);
        } catch (AddLikeErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(output);
        }
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
    @PostMapping(value = "/get/like")
    public ResponseEntity<GetLikeUseCaseOutput> GetLike(@RequestBody GetLikeUseCaseInput requestBody) {
        GetLikeUseCaseInput input = new GetLikeUseCaseInput();
        GetLikeUseCaseOutput output = new GetLikeUseCaseOutput();
        input.setUserID(requestBody.getUserID());
        //----
        try {
            this.getLikeUseCase.execute(input, output);
        } catch (GetLikeErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(output);
        }
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
    @PostMapping(value = "/remove/like")
    public ResponseEntity<RemoveLikeUseCaseOutput> RemoveLike(@RequestBody RemoveLikeUseCaseInput requestBody) {
        RemoveLikeUseCaseInput input = new RemoveLikeUseCaseInput();
        RemoveLikeUseCaseOutput output = new RemoveLikeUseCaseOutput();
        //----
        input.setUserID(requestBody.getUserID());
        input.setItemID(requestBody.getItemID());
        try {
            this.removeLikeUseCase.execute(input,output);
        } catch (RemoveLikeErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(output);
        }
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
    @PostMapping(value = "/create/order")
    public ResponseEntity<AddOrderUseCaseOutput> AddOrder(@RequestBody AddOrderUseCaseInput requestBody) {
        System.out.println("----------server----------");        
        AddOrderUseCaseInput input = new AddOrderUseCaseInput();
        AddOrderUseCaseOutput output = new AddOrderUseCaseOutput();
        input.setItemList(requestBody.getItemList());
        input.setOrderDate("2021/01/6");
        input.setUserID(requestBody.getUserID());
        if(requestBody.getDiscountID()!=0){
            input.setDiscountID(requestBody.getDiscountID());
        }else{
            input.setDiscountID(1);
        }

        // //----
        try {
            this.addOrderUseCase.execute(input,output);
        } catch (AddOrderErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(output);
        }
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
    @PostMapping(value = "/history")
    public ResponseEntity<HistoryOrderUseCaseOutput> HistoryOrder(@RequestBody HistoryOrderUseCaseInput requestBody) {
        System.out.println("----------server get history----------");        
        HistoryOrderUseCaseInput input = new HistoryOrderUseCaseInput();
        HistoryOrderUseCaseOutput output = new HistoryOrderUseCaseOutput();
        input.setUserID(requestBody.getUserID());
        // //----
        try {
            this.historyOrderUseCase.execute(input,output);
        } catch (HistoryOrderErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(output);
        }
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
}