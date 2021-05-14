class ElDiario : Newspaper{
    override fun publish(report: Report) {
        return println(report.paragraph1)
    }
}