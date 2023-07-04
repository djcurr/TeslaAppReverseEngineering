package expo.modules.core;

import android.content.Context;
import android.view.View;
import expo.modules.core.interfaces.ExpoProp;
import expo.modules.core.interfaces.RegistryLifecycleListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class ViewManager<V extends View> implements RegistryLifecycleListener {
    private Map<String, ViewManager<V>.PropSetterInfo> mPropSetterInfos;
    private Map<String, Method> mPropSetters;

    /* loaded from: classes5.dex */
    public class PropSetterInfo {
        private Class<?> mExpectedPropertyClass;

        PropSetterInfo(Class<?>[] clsArr) {
            this.mExpectedPropertyClass = clsArr[clsArr.length - 1];
        }

        public Class<?> getExpectedValueClass() {
            return this.mExpectedPropertyClass;
        }
    }

    /* loaded from: classes5.dex */
    public enum ViewManagerType {
        SIMPLE,
        GROUP
    }

    private Map<String, Method> getPropSetters() {
        Method[] declaredMethods;
        Map<String, Method> map = this.mPropSetters;
        if (map != null) {
            return map;
        }
        this.mPropSetters = new HashMap();
        for (Method method : getClass().getDeclaredMethods()) {
            if (method.getAnnotation(ExpoProp.class) != null) {
                String name = ((ExpoProp) method.getAnnotation(ExpoProp.class)).name();
                if (method.getParameterTypes().length == 2) {
                    if (!this.mPropSetters.containsKey(name)) {
                        this.mPropSetters.put(name, method);
                    } else {
                        throw new IllegalArgumentException("View manager " + getName() + " prop setter name already registered: " + name + ".");
                    }
                } else {
                    throw new IllegalArgumentException("Expo prop setter should define at least two arguments: view and prop value. Propsetter for " + name + " of module " + getName() + " does not define these arguments.");
                }
            }
        }
        return this.mPropSetters;
    }

    public abstract V createViewInstance(Context context);

    public List<String> getExportedEventNames() {
        return Collections.emptyList();
    }

    public Map<String, Object> getMetadata() {
        HashMap hashMap = new HashMap();
        hashMap.put("propsNames", getPropSetters().keySet().toArray());
        return hashMap;
    }

    public abstract String getName();

    public Map<String, ViewManager<V>.PropSetterInfo> getPropSetterInfos() {
        Map<String, ViewManager<V>.PropSetterInfo> map = this.mPropSetterInfos;
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Method> entry : getPropSetters().entrySet()) {
            hashMap.put(entry.getKey(), new PropSetterInfo(entry.getValue().getParameterTypes()));
        }
        this.mPropSetterInfos = hashMap;
        return hashMap;
    }

    public abstract ViewManagerType getViewManagerType();

    public void onDropViewInstance(V v11) {
    }

    protected Object transformArgumentToClass(Object obj, Class<?> cls) {
        return ArgumentsHelper.validatedArgumentForClass(obj, cls);
    }

    public void updateProp(V v11, String str, Object obj) {
        Method method = getPropSetters().get(str);
        if (method != null) {
            try {
                method.invoke(this, v11, transformArgumentToClass(obj, getPropSetterInfos().get(str).getExpectedValueClass()));
                return;
            } catch (IllegalAccessException | InvocationTargetException e11) {
                throw new RuntimeException("Exception occurred while updating property " + str + " on module " + getName() + ": " + e11.getMessage(), e11);
            }
        }
        throw new IllegalArgumentException("There is no propSetter in " + getName() + " for prop of name " + str + ".");
    }
}