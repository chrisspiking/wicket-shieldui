package com.shieldui.wicket.maskedtextbox;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class MaskedTextBox extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final MaskedTextBoxOptions options = new MaskedTextBoxOptions();
    
    public MaskedTextBox(String id)
    {
        super(id, "MaskedTextBox");
    }
    
    @Override
    public MaskedTextBoxOptions getOptions()
    {
        return options;
    }
    
    public void setEnabled(AjaxRequestTarget target, Boolean enabled)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.enabled(" + (enabled ? "true" : "false") + "); }"
                )
        );
    }
}
