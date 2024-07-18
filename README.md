# Socks5

[![status](https://github.com/heiher/socks5/actions/workflows/build.yaml/badge.svg?branch=master&event=push)](https://github.com/heiher/socks5)

A simple and lightweight socks5 server for Android.

## Features

* IPv4/IPv6. (dual stack)
* Standard `CONNECT` command.
* Standard `UDP ASSOCIATE` command.
* Extended `FWD UDP` command. (UDP in TCP)
* Multiple username/password authentication.

## How to Build

Fork this project and create a new release, or build manually:

```bash
git clone --recursive https://github.com/heiher/socks5
cd socks5
gradle assembleDebug
```

## Dependencies

* HevSocks5Server - https://github.com/heiher/hev-socks5-server

## Contributors

* **hev** - https://hev.cc

## License

MIT
