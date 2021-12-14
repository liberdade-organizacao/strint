# Clojure String Interpolation

String formatting with hashmaps in Clojure

## Usage

``` clj
(require '[br.bsb.liberdade.strint :as strint])

(def parameters
    {"name" "Joe"
     "age"  27})

(def string-to-interpolate
    "Hello, my name is %{name} and I am %{age} years old.")

(strint/strint string-to-interpolate parameters)
;; => "Hello, my name is Joe and I am 27 years old."
```

## License

Copyright © 2021 Liberdade Controle & Automação

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
