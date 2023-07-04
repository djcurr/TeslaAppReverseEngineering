package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.spi.PropertyDefiner;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class DefinePropertyAction extends Action {
    PropertyDefiner definer;
    boolean inError;
    String propertyName;
    ActionUtil.Scope scope;
    String scopeStr;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        StringBuilder sb2;
        String str2;
        this.scopeStr = null;
        this.scope = null;
        this.propertyName = null;
        this.definer = null;
        this.inError = false;
        this.propertyName = attributes.getValue("name");
        String value = attributes.getValue("scope");
        this.scopeStr = value;
        this.scope = ActionUtil.stringToScope(value);
        if (OptionHelper.isEmpty(this.propertyName)) {
            sb2 = new StringBuilder();
            str2 = "Missing property name for property definer. Near [";
        } else {
            String value2 = attributes.getValue(Action.CLASS_ATTRIBUTE);
            if (!OptionHelper.isEmpty(value2)) {
                try {
                    addInfo("About to instantiate property definer of type [" + value2 + "]");
                    PropertyDefiner propertyDefiner = (PropertyDefiner) OptionHelper.instantiateByClassName(value2, PropertyDefiner.class, this.context);
                    this.definer = propertyDefiner;
                    propertyDefiner.setContext(this.context);
                    PropertyDefiner propertyDefiner2 = this.definer;
                    if (propertyDefiner2 instanceof LifeCycle) {
                        ((LifeCycle) propertyDefiner2).start();
                    }
                    interpretationContext.pushObject(this.definer);
                    return;
                } catch (Exception e11) {
                    this.inError = true;
                    addError("Could not create an PropertyDefiner of type [" + value2 + "].", e11);
                    throw new ActionException(e11);
                }
            }
            sb2 = new StringBuilder();
            str2 = "Missing class name for property definer. Near [";
        }
        sb2.append(str2);
        sb2.append(str);
        sb2.append("] line ");
        sb2.append(getLineNumber(interpretationContext));
        addError(sb2.toString());
        this.inError = true;
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        if (this.inError) {
            return;
        }
        if (interpretationContext.peekObject() != this.definer) {
            addWarn("The object at the of the stack is not the property definer for property named [" + this.propertyName + "] pushed earlier.");
            return;
        }
        addInfo("Popping property definer for property named [" + this.propertyName + "] from the object stack");
        interpretationContext.popObject();
        String propertyValue = this.definer.getPropertyValue();
        if (propertyValue != null) {
            ActionUtil.setProperty(interpretationContext, this.propertyName, propertyValue, this.scope);
        }
    }
}