package com.breach.huajinbao.service.quest.Impl;

import com.breach.common.entity.Questionnaire;
import com.breach.huajinbao.mapper.quest.QuestMapper;
import com.breach.huajinbao.service.quest.IRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestServiceImpl implements IRequestService {

    @Autowired
    private QuestMapper mapper;

    @Override
    public void quest(Questionnaire q) {
        mapper.Quest(q);
    }
}
