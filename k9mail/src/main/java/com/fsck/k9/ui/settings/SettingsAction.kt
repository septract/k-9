package com.fsck.k9.ui.settings

import android.app.Activity
import com.fsck.k9.activity.setup.AccountSetupBasics
import com.fsck.k9.activity.setup.Prefs
import de.cketti.library.changelog.ChangeLog

internal enum class SettingsAction {
    GENERAL_SETTINGS {
        override fun execute(activity: Activity) {
            Prefs.actionPrefs(activity)
        }
    },
    ADD_ACCOUNT {
        override fun execute(activity: Activity) {
            AccountSetupBasics.actionNewAccount(activity)
        }
    },
    ABOUT_SCREEN {
        override fun execute(activity: Activity) {
            AboutActivity.start(activity)
        }
    },
    CHANGELOG_SCREEN {
        override fun execute(activity: Activity) {
            ChangeLog(activity).fullLogDialog.show()
        }
    };

    abstract fun execute(activity: Activity)
}
