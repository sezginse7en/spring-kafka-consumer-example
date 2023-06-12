package com.example.kafka.consumer.listener;

import com.example.kafka.consumer.dto.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ConsumerListener {


    @KafkaListener(topics = "${kafka.topic}")
    public void consume(ConsumerRecord<String, Product> payload){

        System.out.println(payload.value());

    }




}
