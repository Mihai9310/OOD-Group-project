class TicketMachine(
    val origin: Destination,
    val destinations: MutableList<Destination>
) {
    fun listDestinations(): List<Destination> = destinations.toList()

}
