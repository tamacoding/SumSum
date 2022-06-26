package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.MessageDAO;
import com.example.kovengerss.domain.vo.MessageVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("message") @Primary
public class MessageServiceImpl implements MessageService{
    private final MessageDAO messageDAO;


    @Override
    public List<MessageVO> getList(Integer userNum) {
        return messageDAO.msgGetList(userNum);
    }

    @Override
    public void msgInsert(MessageVO messageVO) {
        messageDAO.msgInsert(messageVO);
    }

    @Override
    public boolean msgUpdate(MessageVO messageVO) {
        return messageDAO.msgUpdate(messageVO);
    }

    @Override
    public boolean msgDelete(Integer messageNum) {
        return messageDAO.msgDelete(messageNum);
    }

    @Override
    public int msgGetTotal(Integer userNum) {
        return messageDAO.msgGetTotal(userNum);
    }

    @Override
    public String msgGetSendDate(int messageNum) {
        return messageDAO.msgGetSendDate(messageNum);
    }

    @Override
    public MessageVO msgSelectOne(int messageNum) {
        return messageDAO.msgSelectOne(messageNum);
    }

    @Override
    public String msgSelectTitle(int messageNum) {
        return messageDAO.msgSelectTitle(messageNum);
    }

    @Override
    public String msgSelectContent(int messageNum) {
        return messageDAO.msgSelectContent(messageNum);
    }
}
