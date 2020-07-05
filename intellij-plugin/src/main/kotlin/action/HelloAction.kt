package action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        Messages.showMessageDialog(event.project,
            "Hello World!",
            "Greeting",
            Messages.getInformationIcon())
    }
}