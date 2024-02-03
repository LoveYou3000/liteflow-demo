package com.zhang.liteflow.demo.controller;

import com.yomahub.liteflow.core.FlowExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * liteflow controller
 *
 * @author zhang
 * @date 2024-02-03 15:14
 */
@RestController
@RequestMapping("lf")
public class LiteflowController {

    @Autowired
    private FlowExecutor flowExecutor;

    @GetMapping("doChain")
    public String doChain(String chainName) {
        flowExecutor.execute2Resp(chainName);
        return "success";
    }

}
