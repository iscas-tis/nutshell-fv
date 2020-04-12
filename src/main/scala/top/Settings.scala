package top

trait Common {
  val EnableILA = true
  val VAddrBits = 39
  val EnableDebug = false
}

trait OoOCore {
  val HasL2cache = true
  val HasPrefetch = true
  val EnableMultiIssue = true
  val EnableSuperScalarExec = true
  val EnableOutOfOrderExec = true
  val HasDTLB = true
  val HasITLB = true
  val HasDcache = true
  val HasIcache = true
  val MmodeOnly = false
  val IsRV32 = false
}

trait SeqCore {
  val HasL2cache = false
  val HasPrefetch = false
  val EnableMultiIssue = false
  val EnableSuperScalarExec = false
  val EnableOutOfOrderExec = false
  val HasDTLB = true
  val HasITLB = true
  val HasDcache = true
  val HasIcache = true
  val MmodeOnly = false
  val IsRV32 = false
}

trait SmallCore {
  val HasL2cache = false
  val HasPrefetch = false
  val EnableMultiIssue = false
  val EnableSuperScalarExec = false
  val EnableOutOfOrderExec = false
  val HasDTLB = false
  val HasITLB = false
  val HasDcache = false
  val HasIcache = false
  val MmodeOnly = true
  val IsRV32 = true
}

object Settings extends Common with SmallCore {}

// To generate RV32 core
// 1. Enble Settings.IsRV32
// 2. Set DATAWIDTH = 32 in Makefile
// 3. Define __RV32__ macro in difftest.h