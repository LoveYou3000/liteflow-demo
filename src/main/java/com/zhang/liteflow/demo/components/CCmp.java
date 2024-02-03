package com.zhang.liteflow.demo.components;

import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * A Component
 *
 * @author zhang
 * @date 2024-02-03 15:11
 */
@Component("c")
@Slf4j
public class CCmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        log.info("C component is running...");
    }

}
