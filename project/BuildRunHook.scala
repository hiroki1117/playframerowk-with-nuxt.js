import sbt._
import play.sbt.PlayRunHook
import scala.sys.process.Process

object BuildRunHook {
  def apply(path: File): PlayRunHook = {
    object ProcessRun extends PlayRunHook {
      var process: Option[Process] = None

      override def beforeStarted: Unit = {
        process = Option(Process(ClientCommands.dev, path / "resources").run)
      }

      override def afterStopped: Unit = {
        process.foreach(_.destroy)
        process = None
      }
    }
    ProcessRun
  }
}

object ClientCommands {
  val dev: String = "yarn run dev"
}
