package com.shieldui.wicket.menu;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JsonFunction;

public class ContextMenuOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    public enum Event
    {
        FOCUS ("focus"),
        BLUR ("blur"),
        EXPAND ("expand"),
        COLLAPSE ("collapse"),
        CLICK ("click"),
        SELECT ("select"),
        OPEN ("open"),
        CLOSE ("close");
        
        private final String value;
        
        private Event(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum Orientation
    {
        HORIZONTAL ("horizontal"),
        VERTICAL ("vertical");
        
        private final String value;
        
        private Orientation(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static final class AnimationOptions extends HashMapSerializable {
        public Boolean enabled;
        public Integer openDelay;
        public Integer closeDelay;

        public Boolean getEnabled() {
            return enabled;
        }

        public AnimationOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Integer getOpenDelay() {
            return openDelay;
        }

        public AnimationOptions setOpenDelay(Integer openDelay) {
            this.openDelay = openDelay;
            return this;
        }

        public Integer getCloseDelay() {
            return closeDelay;
        }

        public AnimationOptions setCloseDelay(Integer closeDelay) {
            this.closeDelay = closeDelay;
            return this;
        }
    }
    
    public String cls;
    public Object width;
    public Object height;
    public Object dataSource;
    public Boolean readDataSource;
    public Orientation orientation;
    public Integer delay;
    public AnimationOptions animation = new AnimationOptions();
    public Object contentTemplate;
    public String overflow;
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();
    public String target;
    public String filter;
    public Boolean focusOnOpen;

    public String getCls() {
        return cls;
    }

    public ContextMenuOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Object getWidth() {
        return width;
    }

    public ContextMenuOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }
    
    public ContextMenuOptions setWidth(String width) {
        this.width = width;
        return this;
    }

    public Object getHeight() {
        return height;
    }

    public ContextMenuOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }
    
    public ContextMenuOptions setHeight(String height) {
        this.height = height;
        return this;
    }

    public ContextMenuOptions setDataSource(DataSourceOptions dataSource) {
        // NOTE: serialize the DS to a hash explicitly in this case
        this.dataSource = dataSource.toHashMap();
        return this;
    }
    
    public ContextMenuOptions setDataSource(JsonFunction dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    public ContextMenuOptions setDataSource(DataSource dataSourceObject) {
        this.dataSource = new JsonFunction("window." + dataSourceObject.getJsVariableName());
        return this;
    }

    public Boolean getReadDataSource() {
        return readDataSource;
    }

    public ContextMenuOptions setReadDataSource(Boolean readDataSource) {
        this.readDataSource = readDataSource;
        return this;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public ContextMenuOptions setOrientation(Orientation orientation) {
        this.orientation = orientation;
        return this;
    }

    public Integer getDelay() {
        return delay;
    }

    public ContextMenuOptions setDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    public AnimationOptions getAnimation() {
        return animation;
    }

    public ContextMenuOptions setAnimation(AnimationOptions animation) {
        this.animation = animation;
        return this;
    }

    public Object getContentTemplate() {
        return contentTemplate;
    }

    public ContextMenuOptions setContentTemplate(String contentTemplate) {
        this.contentTemplate = contentTemplate;
        return this;
    }
    
    public ContextMenuOptions setContentTemplate(JsonFunction contentTemplate) {
        this.contentTemplate = contentTemplate;
        return this;
    }

    public String getOverflow() {
        return overflow;
    }

    public ContextMenuOptions setOverflow(String overflow) {
        this.overflow = overflow;
        return this;
    }

    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public ContextMenuOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public ContextMenuOptions setTarget(String target) {
        this.target = target;
        return this;
    }

    public String getFilter() {
        return filter;
    }

    public ContextMenuOptions setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    public Boolean getFocusOnOpen() {
        return focusOnOpen;
    }

    public ContextMenuOptions setFocusOnOpen(Boolean focusOnOpen) {
        this.focusOnOpen = focusOnOpen;
        return this;
    }
}
