package listeners

import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ex.ToolWindowManagerListener

class MyToolwindowListener: ToolWindowManagerListener {

    val LOG: Logger = Logger.getInstance(MyToolwindowListener::class.java)

    override fun stateChanged() {
        super.stateChanged()
        LOG.info("state changed");
    }

    override fun toolWindowRegistered(id: String) {
        super.toolWindowRegistered(id)
        LOG.info("tool window registered");
    }

    override fun toolWindowUnregistered(id: String, toolWindow: ToolWindow) {
        super.toolWindowUnregistered(id, toolWindow)
        LOG.info("tool window unregistered");
    }
}