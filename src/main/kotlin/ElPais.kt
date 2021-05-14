class ElPais : Newspaper{
    override fun publish(report: Report) {
        return println(report.paragraph2)
    }
}