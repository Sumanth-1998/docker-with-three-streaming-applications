package org.sumanth.orderstore.valuejoiner;

import avro.CustomerInfo;
import avro.CustomerOrderInfo;
import avro.Order;
import org.apache.kafka.streams.kstream.ValueJoiner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CustomerOrderJoiner implements ValueJoiner<CustomerInfo, List<Order>, CustomerOrderInfo> {
    final Logger LOGGER = LoggerFactory.getLogger(CustomerOrderJoiner.class);
    @Override
    public CustomerOrderInfo apply(CustomerInfo customerInfo, List<Order> order) {
        CustomerOrderInfo customerOrderInfo = new CustomerOrderInfo();
        customerOrderInfo.setName(customerInfo.getName());
        customerOrderInfo.setEmail(customerInfo.getEmail());
        customerOrderInfo.setSsn(customerInfo.getSsn());
        customerOrderInfo.setPhone(customerInfo.getPhone());
        customerOrderInfo.setOrderList(order);
        return customerOrderInfo;
    }
}
