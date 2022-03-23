package kata

func ToCamelCase(s string) string {

  var test []rune
  b := false
  for _, v := range s {
    if v == 95 || v == 45 {
      b = true
      continue
    } else if b == true {
      if v < 97 {
      test = append(test, v)
      b = false
      } else {
        test = append(test, v-32)
        b = false
      }
    } else {
      test = append(test, v)
    }
  }
  return string(test)
}