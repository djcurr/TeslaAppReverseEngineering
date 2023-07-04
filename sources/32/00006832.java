package expo.modules;

import expo.modules.adapters.react.ReactAdapterPackage;
import expo.modules.application.ApplicationPackage;
import expo.modules.battery.BatteryPackage;
import expo.modules.calendar.CalendarPackage;
import expo.modules.constants.ConstantsPackage;
import expo.modules.contacts.ContactsPackage;
import expo.modules.core.BasePackage;
import expo.modules.core.interfaces.Package;
import expo.modules.crypto.CryptoPackage;
import expo.modules.errorrecovery.ErrorRecoveryPackage;
import expo.modules.filesystem.FileSystemPackage;
import expo.modules.font.FontLoaderPackage;
import expo.modules.haptics.HapticsPackage;
import expo.modules.imageloader.ImageLoaderPackage;
import expo.modules.imagepicker.ImagePickerPackage;
import expo.modules.keepawake.KeepAwakePackage;
import expo.modules.kotlin.ModulesProvider;
import expo.modules.kotlin.modules.Module;
import expo.modules.lineargradient.LinearGradientModule;
import expo.modules.location.LocationPackage;
import expo.modules.mailcomposer.MailComposerPackage;
import expo.modules.sms.SMSPackage;
import expo.modules.webbrowser.WebBrowserPackage;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class ExpoModulesPackageList implements ModulesProvider {

    /* loaded from: classes6.dex */
    private static class LazyHolder {
        static final List<Package> packagesList = Arrays.asList(new ReactAdapterPackage(), new ApplicationPackage(), new BatteryPackage(), new CalendarPackage(), new ConstantsPackage(), new ContactsPackage(), new BasePackage(), new CryptoPackage(), new ErrorRecoveryPackage(), new FileSystemPackage(), new FontLoaderPackage(), new HapticsPackage(), new ImageLoaderPackage(), new ImagePickerPackage(), new KeepAwakePackage(), new LocationPackage(), new MailComposerPackage(), new SMSPackage(), new WebBrowserPackage());
        static final List<Class<? extends Module>> modulesList = Arrays.asList(LinearGradientModule.class);

        private LazyHolder() {
        }
    }

    public static List<Package> getPackageList() {
        return LazyHolder.packagesList;
    }

    @Override // expo.modules.kotlin.ModulesProvider
    public List<Class<? extends Module>> getModulesList() {
        return LazyHolder.modulesList;
    }
}