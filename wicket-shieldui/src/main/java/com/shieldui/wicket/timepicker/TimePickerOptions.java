package com.shieldui.wicket.timepicker;

import com.shieldui.wicket.listbox.ListBoxOptions;

public class TimePickerOptions extends com.shieldui.wicket.datepicker.DatePickerOptions {
    private static final long serialVersionUID = 1L;
    
    public ListBoxOptions listBox = new ListBoxOptions();

    public ListBoxOptions getListBox() {
        return listBox;
    }

    public TimePickerOptions setListBox(ListBoxOptions listBox) {
        this.listBox = listBox;
        return this;
    }
}
