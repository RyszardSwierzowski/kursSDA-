package com.swierzowski.aspekty.rest;


import com.swierzowski.aspekty.annotation.Aspectable;
import com.swierzowski.aspekty.model.Company;
import com.swierzowski.aspekty.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/endpoint")
public class CompanyController {


//    @GetMapping("/messages/{podany_tekst}")

    @GetMapping("/messages/{tresc}")
    ResponseEntity<Message> getMessage( @PathVariable("tresc") String t){
        Message message = new Message();
        message.setMessage(t);
        return ResponseEntity.ok()
                .body(message);
    }

    @Aspectable // moja adnotacja do zad 3
    @GetMapping("/messages")
    ResponseEntity<List<Message>> getMessages( ){
        Message message1 = new Message();
        Message message2 = new Message();
        Message message3 = new Message();

        message1.setMessage("dsadas");
        message2.setMessage("dsadas");
        message3.setMessage("dsadas");

        ArrayList<Message> msgList = new ArrayList<>();
        msgList.add(message1);
        msgList.add(message2);
        msgList.add(message3);

        return ResponseEntity.ok()
                .body(msgList);
    }


}
