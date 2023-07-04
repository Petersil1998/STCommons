package net.petersil98.stcommons;

import net.petersil98.core.util.EncryptionUtil;
import net.petersil98.core.util.Loader;
import net.petersil98.core.util.settings.Language;
import net.petersil98.core.util.settings.Settings;

public class STCommons {

    public static void main(String[] args) {
        Settings.setAPIKey(() -> EncryptionUtil.encrypt(System.getenv("API_KEY")));
        Settings.setDecryptor(EncryptionUtil::decrypt);
        Settings.setLanguage(Language.EN_US);
        Loader.init();
    }
}
