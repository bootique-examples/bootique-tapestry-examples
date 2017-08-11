package io.bootique.tapestry.demo.pages;

import io.bootique.tapestry.demo.services.DeferredService;
import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.Link;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.PageRenderLinkSource;

@Import(stylesheet = "bq-demo.css")
public class HelloPage {

    @Inject
    private DeferredService service;

    @Persist
    private String name;

    @Inject
    private ComponentResources componentResources;

    @Inject
    private PageRenderLinkSource linkSource;

    public Link getSignOutLink() {
        Link link = linkSource.createPageRenderLink(Login.class);
        componentResources.discardPersistentFieldChanges();
        return link;
    }

    public void set(String userName) {
        this.name = userName;
    }

    public String getName() {
        return this.name;
    }

    public String getData() {
        return service.data();
    }
}