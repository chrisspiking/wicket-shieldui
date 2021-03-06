package com.shieldui.wicket.radiobutton;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ClickEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ClickEventListener()
    {
        super(RadioButtonOptions.Event.CLICK.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +                                
                "\"checked\":" + eventVarName + ".target.checked()," + 
                "\"enabled\":" + eventVarName + ".target.enabled()," + 
                "\"visible\":" + eventVarName + ".target.visible()" + 
                "}";
    }
}
