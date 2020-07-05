import com.intellij.openapi.components.ApplicationComponent
import com.intellij.openapi.diagnostic.Logger

class ApplicationComponentExample : ApplicationComponent {

    val LOG: Logger = Logger.getInstance(ApplicationComponentExample::class.java)

    override fun initComponent() {
        super.initComponent()
        LOG.info("Initializing plugin. Project is not opened yet");
    }

    override fun disposeComponent() {
        super.disposeComponent()
        LOG.info("Disposing plugin. Intellij is closing");
    }

    override fun getComponentName(): String {
        return "ApplicationComponentExample"
    }
}