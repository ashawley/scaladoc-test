/** A logger */
trait Logger {
  /**
   * Log
   * @return [[org.slf4j.Logger]]
   */
  val log: org.slf4j.Logger = org.slf4j.LoggerFactory.getLogger(getClass.getName)
}
