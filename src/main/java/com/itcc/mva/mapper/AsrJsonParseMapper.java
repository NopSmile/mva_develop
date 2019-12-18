package com.itcc.mva.mapper;

import com.itcc.mva.entity.IntelligentAsrEntity;
import com.itcc.mva.entity.QuarkCallbackEntity;

import java.util.List;

public interface AsrJsonParseMapper {
    /**
     *
     * @param top 查询多少条
     * @return
     */
    public List<IntelligentAsrEntity> queryPendingTopMapper(int top);

    public List<IntelligentAsrEntity> queryWaitingSendJt(int num);
    public List<QuarkCallbackEntity> queryWaitingSendKd(int num);
    public List<IntelligentAsrEntity> queryWaitingSendAl(int num);

}