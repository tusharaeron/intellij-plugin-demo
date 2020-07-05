package extensions

import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity

class PostStartupActivity : StartupActivity {
    val LOG: Logger = Logger.getInstance(PostStartupActivity::class.java)

    override fun runActivity(project: Project) {
        LOG.info("Project startup activity. This is called even after extensions.PreLoadingActivity");
    }

}