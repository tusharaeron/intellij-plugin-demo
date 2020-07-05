package components

import com.intellij.openapi.components.ProjectComponent
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project

class ProjectComponentExample : ProjectComponent {

    val LOG: Logger = Logger.getInstance(ProjectComponentExample::class.java)
    private var project: Project? = null
    private var applicationComponent: ApplicationComponentExample? = null

    constructor (project: Project, applicationComponentExample: ApplicationComponentExample){
        this.project = project
        this.applicationComponent = applicationComponentExample
    }

    override fun initComponent() {
        super.initComponent()
        //called before projectOpened()
    }

    override fun disposeComponent() {
        super.disposeComponent()
        //called after projectClosed()
    }

    override fun projectOpened() {
        super.projectOpened()
        LOG.info(String.format("Project '%s' has been opened, base dir '%s'", project?.getName(), project?.getBaseDir()?.getCanonicalPath()));
    }

    override fun projectClosed() {
        super.projectClosed()
        LOG.info(String.format("Project '%s' has been closed.", project?.getName()));
    }

    override fun getComponentName(): String {
        return "projectComponentExample";
    }
}