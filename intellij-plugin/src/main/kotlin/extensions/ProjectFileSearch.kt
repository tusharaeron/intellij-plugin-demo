package extensions

import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity
import java.io.File

class ProjectFileSearch : StartupActivity {

    override fun runActivity(project: Project) {
        findFileInProject(project?.getBaseDir()?.getCanonicalPath(), "plugin")
    }

    private fun findFileInProject(projectPath: String?, filename: String) {
        val maindir = File(projectPath)

        if (maindir.exists() && maindir.isDirectory()) {
            val arr = maindir.listFiles()
            if (SearchFile(arr, 0, 0, filename)){
                System.out.println("File found")
            } else {
                System.out.println("File not found")
            }
        }
    }

    private fun SearchFile(arr: Array<File>, index: Int, level: Int, fileName: String) : Boolean {
        if (index === arr.size)
            return false

        if (arr[index].isFile && arr[index].name.startsWith(fileName)) {
            System.out.println("File found : " + arr[index].name)
            return true
        }
        else if (arr[index].isDirectory) {
            if(SearchFile(arr[index].listFiles(), 0, level + 1, fileName))
                return true
        }

        return SearchFile(arr, index + 1, level, fileName)

    }

}