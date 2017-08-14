package io.bootique.tapestry.demo.services;

public class DeferredServiceImpl implements DeferredService {

    @Override
    public String data() {
        return "from Bootique";
    }
}
