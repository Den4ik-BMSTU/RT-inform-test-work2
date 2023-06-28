static void main(String[] args) {
  println "Добрый день, меня зовут Денис Райцис"
  def firstList = new ArrayList<>()
  def secondList = new HashMap<>()
  firstList.add(1)
  firstList.add(2)
  firstList.add(1)
  firstList.add(1)
  firstList.add(1)
  firstList.add(1)
  firstList.add(2)
  firstList.add(1)
  firstList.add(3)
  firstList.add(1)
  firstList.add(1)

  for (def i=0; i<firstList.size(); i++){
    def a = firstList.get(i)
    def b=1
    if (secondList.get(a) == null){
      secondList[a] = b
    } else {
      b = secondList.get(a)
      b++
      secondList[a] = b
    }
  }

  println(firstList)
  println(secondList)

}