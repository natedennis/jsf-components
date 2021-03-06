package com.outjected.jsf.component;

import javax.faces.component.UIComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.component.UIMessage;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Facet;
import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.Tag;

@JsfComponent(type = "com.outjected.jsf.DecorateInput", family = "com.outjected.layout", renderer = @JsfRenderer(type = "com.outjected.jsf.decorateInput"), tag = @Tag(name = "decorateInput"), attributes = {
        "base-props.xml", "core-props.xml" })
abstract public class AbstractDecorateInput extends UIComponentBase {

    public AbstractDecorateInput() {
        super();
        this.setMessage(new UIMessage());
    }

    @Attribute(required = true)
    public abstract String getLabel();

    @Attribute(required = false, defaultValue = "true")
    public abstract boolean isRenderMessage();

    @Facet(name = "message")
    public abstract UIComponent getMessage();

    public abstract void setMessage(UIComponent message);
}
