package components

import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleComponent

class ModuleLevelComponent : ModuleComponent {
    val LOG: Logger = Logger.getInstance(ModuleLevelComponent::class.java)

    private var module: Module? = null

    constructor (module: Module){
        this.module = module
    }
    override fun projectOpened() {
        LOG.info(String.format("Module '%s' has been opened'", module?.getName()));
    }

    override fun projectClosed() {
        LOG.info(String.format("Module '%s' has been closed'", module?.getName()));
    }

    override fun moduleAdded() {
        LOG.info(String.format("Module '%s' has been added'", module?.getName()));
    }
}