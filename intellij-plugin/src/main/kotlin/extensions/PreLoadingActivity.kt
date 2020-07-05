package extensions

import com.intellij.openapi.application.PreloadingActivity
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.progress.ProgressIndicator

class PreLoadingActivity : PreloadingActivity() {

    val LOG: Logger = Logger.getInstance(PreLoadingActivity::class.java)

    override fun preload(indicator: ProgressIndicator) {
        LOG.info("Preloading plugin-data. Called after Project opened");
    }
}