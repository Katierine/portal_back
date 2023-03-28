package com.record.service.impl;

import com.record.entity.Designer;
import com.record.mapper.DesignerMapper;
import com.record.service.DesignerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *

 */
@Service
public class DesignerServiceImpl extends ServiceImpl<DesignerMapper, Designer> implements DesignerService {

    @Autowired
    private DesignerMapper designerMapper;


    @Override
    public List<Designer> selectDesigners() {
        return designerMapper.selectList(null);
    }
}
