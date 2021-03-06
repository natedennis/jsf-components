package com.outjected.jsf.component;

import javax.faces.component.UIComponentBase;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.Tag;

import com.outjected.jsf.core.Notices;

@JsfComponent(type = "com.outjected.jsf.Notice", family = "com.outjected.layout", renderer = @JsfRenderer(type = "com.outjected.jsf.notice"), tag = @Tag(name = "notice"), attributes = {
        "base-props.xml", "core-props.xml" })
abstract public class AbstractNotice extends UIComponentBase {

    @Attribute(required = true)
    public abstract Notices getNotices();

    @Attribute
    public abstract boolean isExpanded();

    @Attribute(defaultValue = "Has Errors -- Click for Details")
    public abstract String getErrorTitle();

    @Attribute(defaultValue = "Has Warnings -- Click for Details")
    public abstract String getWarningTitle();

    @Attribute(defaultValue = "Has Infos - Click for Details")
    public abstract String getInfoTitle();
}
