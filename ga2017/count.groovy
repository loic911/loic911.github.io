
def numbers = []
new File("test.html").text.findAll(/ts="[0-9][0-9]"/).each {
	println it
	numbers << Integer.parseInt(it.replace("ts=","").replace("\"",""))
}
def total = 0
numbers.each { total += it }

println total
println (total / 60)
