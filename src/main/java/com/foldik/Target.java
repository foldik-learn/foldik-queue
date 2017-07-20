package com.foldik;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

public class Target {

    private Optional<String> targetUrl;
    private AtomicBoolean isPresentTargetUrl;

    public Target() {
        targetUrl = Optional.empty();
        isPresentTargetUrl = new AtomicBoolean(false);
    }

    public Optional<String> getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(Optional<String> targetUrl) {
        if (isPresentTargetUrl.get() == false) {
            this.targetUrl = targetUrl;
        } else {
            throw new IllegalStateException("target url already exists");
        }
    }
}
