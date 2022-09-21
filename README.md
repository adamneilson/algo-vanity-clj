# Algo-vanity-clj

An Algorand vanity address generator written in Clojure. A niche within a niche...

## Installation

Make sure you have [Leiningen](leiningen.org) installed.

## Usage

Clone this repo, `cd` into it and run with `lein run`.

You will be prompted to enter the start of the address (case insensitive). With each additional prefixing character the processing for the address will take an exponentially longer time. Depending on your hardware, you may want to adjust the length of your prefix accordingly.

## Examples

```bash
$ lein run

╔═╗╦  ╔═╗╔═╗  ╦  ╦╔═╗╔╗╔╦╔╦╗╦ ╦  ╔═╗╦   ╦
╠═╣║  ║ ╦║ ║  ╚╗╔╝╠═╣║║║║ ║ ╚╦╝  ║  ║   ║
╩ ╩╩═╝╚═╝╚═╝   ╚╝ ╩ ╩╝╚╝╩ ╩  ╩   ╚═╝╩═╝╚╝

Enter the start of the address (recommend under 6 characters)
SPAC
Addresses checked: 0 after 0.464 seconds
Addresses checked: 100000 after 31.875 seconds
Address: SPACZA7G3I63GM7MXBDSPMPMLZJH4ADUUT6SWSIMHUQYBHZXDKGCFZDP5Q
Mnemonic: tourist gun warrior early require try skill top riot cheap pattern lab clever sick fade mandate word plug copper pull clump across cage absent loop
Done after 105146 addresses checked
```

## License

Copyright © 2022 ADAM NEILSON

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
